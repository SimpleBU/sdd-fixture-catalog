# sdd-fixture-catalog

> ⚠️ Намеренно уязвимое тестовое приложение. Не разворачивать в доступной сети.
> Все «секреты», токены, ключи и персональные данные вымышлены или взяты из публичной документации
> (пример ключа AWS, JWT с jwt.io, тестовые номера карт).

Тестовый стенд для движка детекции чувствительных данных в API (SDD, продукт APISEC):
каталог товаров: почти без чувствительных данных, много похожих имён (ловушки). Для каждого поля, параметра, endpoint'а и константы заранее записан правильный ответ,
поэтому по результату сканирования видно, где движок прав, а где ошибся.

Spring Boot 3.3, Java 17, порт 8085.

## Что внутри

| файл | что это |
|---|---|
| `src/` | код приложения: `controller/` — endpoint'ы, `dto/` — модели с чувствительными полями, `config/` — константы с секретами и ПД |
| `manifest.yaml` | разметка: что лежит в каждом поле и почему. Источник, из которого сгенерировано всё остальное |
| `expected.json` | правильные ответы для движка (поля, endpoint'ы, константы) |
| `inventory.route_candidates.json` | эталонная инвентаризация: что должен выдать анализатор на этом коде |
| `openapi.yaml` | спецификация API со схемами ответов — вход для OpenAPI-адаптера |
| `tools/score.py` | сверка отчёта движка с `expected.json` |

Объём разметки: 18 размеченных полей и параметров (21 мест в API),
из них неочевидных (`hard`) — 0, ловушек (`trap`) — 18, спорных (`GRAY`) — 2;
10 endpoint'ов; 7 констант (0 с чувствительным значением, 3 ловушек).

## Endpoint'ы

| endpoint | ожидаемые категории | признаки |
|---|---|---|
| `GET /api/products` | — |  |
| `GET /api/products/{productId}` | — |  |
| `POST /api/products/bulk` | — | bulk |
| `GET /api/products/export` | — | bulk |
| `POST /api/products/{productId}/subscriptions` | — |  |
| `GET /api/authors` | — |  |
| `GET /api/stats/cardinality` | — |  |
| `GET /api/reports/sales` | — | bulk |
| `GET /api/files/{fileId}` | — |  |
| `GET /api/collections/cards` | — |  |

Полная разметка полей — в `manifest.yaml`: у каждого поля метка категории и пояснение.

## Как пользоваться

Запустить приложение:

```bash
mvn spring-boot:run
```

Проверить движок (нужен собранный `sdd` из sdd-prototype и каталог правил):

```bash
mkdir -p results
sdd scan -input inventory.route_candidates.json -rules <каталог правил> -out results/report.json
python3 tools/score.py --pair expected.json results/report.json --md results/scorecard.md
```

Проверить анализатор: просканируйте этот репозиторий и сравните результат с `inventory.route_candidates.json`
или подайте его инвентаризацию движку вместо эталонной и сравните метрики.

## Разметка

| метка | смысл |
|---|---|
| `PII_DIRECT`, `AUTH`, … | здесь лежат данные этой категории |
| без метки | обычное поле: находка на нём — ложное срабатывание |
| `NONE trap` | ловушка: похоже на чувствительное, но нет |
| `КАТЕГОРИЯ hard` | чувствительное, но имя не подсказывает |
| `accept=A\|B` | другие категории тоже засчитываются |
| `GRAY` | спорно, в метрики не идёт |

Код, `expected.json`, инвентаризация и `openapi.yaml` сгенерированы из `manifest.yaml` генератором sdd-testbed.
Руками их не правят: меняется разметка, затем всё перегенерируется.

Связанные репозитории: sdd-fixture-bank, sdd-fixture-clinic, sdd-fixture-identity, sdd-fixture-workflow, sdd-fixture-catalog.
