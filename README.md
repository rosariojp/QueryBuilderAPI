# QueryBuilderAPI

An API coded in JAVA, use to create JSON structure same as below.
```
{
	"query": {
		"bool": {
			"must": [
				{ "match": { "item": "Milk" }},
				{ "match": { "item_type": "Dairy" }}
			],
			"should": [
				{ "match": { "product_location": "New Mexico" }},
				{ "match": { "warehouse_number": 37 }}
			]
		}
	}
}
```

### Usage:
```
QueryBuilder builder = new QueryBuilder();
builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
builder.bool().shouldMatch("lot_number", 307).bool().mustMatch("expiry_date", "Jan 2020");
```

### Rules:
* Can have a single must or should section inside a bool section
* Can have any attribute name and value for match section
