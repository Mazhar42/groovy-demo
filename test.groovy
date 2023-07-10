class Test {
    static void main(String[] args){
        def ProductCost = [
            [
                "ProductID":"ARK-0001",
                "Cost":45,
                "ProductGroup": "Homeware"
            ],
            [
                "ProductID":"ARK-0002",
                "Cost":50,
                "ProductGroup": "Office Essentials"
            ],
            [
                "ProductID":"ARK-0003",
                "Cost":75,
                "ProductGroup": "Homeware"
            ],
            [
                "ProductID":"ARK-0004",
                "Cost":100,
                "ProductGroup": "Homeware"
            ]
        ]

        println ProductCost.collect{it -> it.Cost}.sum()
    }
}

@Field List product_cost = [
[
	“ProductID” : “ARK-0001”,
	“ProductGroup” : “Homeware”,
    "Cost": 45
],
[
	“ProductID” : “ARK-0002”
	“ProductGroup” : “Office Essentials”,
    "Cost": 50
],
[
	“ProductID” : “ARK-0003”
	“ProductGroup” : “Homeware”,
    "Cost": 75
	
],
[
	“ProductID” : “ARK-0004”,
	“ProductGroup” : “Homeware”,
    "Cost": 100
]
]
