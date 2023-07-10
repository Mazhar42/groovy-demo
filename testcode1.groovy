//class Duck {
//    String getName(){
//        'duck'
//    }
//}
//
//class Cat {
//    String getName(){
//        'cat'
//    }
//}
//
//def duck = new Duck()
//def cat = new Cat()
//def l = [cat,duck]
//
//l.each{it->println it.getName()}
//
//def a = "Good"
//def b = "Morning"
//def str = "${a} ${b}"
//
//println str.class.name

//Set s = [1,2,3,5,7,8,8,8,8,8]
//def arr = s as ArrayList
//println s
//println arr

// def x = 5
// while(x--){
//    println "Hello ${x}"
// }


// def map = [1:20, a:30, 2:42, 4:34, ba:67, 6:39, 7:49]
// map.retainAll{it->it.value%2 == 0}
// println map

// def strings = [ 'a':10, 'b':20, 'c':30 ]
// println strings.drop(0)

def products = [
    [
        "SKU" : "ARK-0001",
        "Label" : "Plastic Chair",
        "UOM" : "PCE",
        "Industry" : "Chemicals",
        "ProductGroup" : "Homeware",
        "ProductType" : "Furniture",
        "PackagingType" : "Bulk",
        "Color" : "Blue",
    ],
    [
        "SKU" : "ARK-0002",
        "Label" : "Desk",
        "UOM" : "PCE",
        "Industry" : "Chemicals",
        "ProductGroup" : "Office Essentials",
        "ProductType" : "Furniture",
        "PackagingType" : "Bulk",
        "Color" : "Black",
    ],
    [
        "SKU" : "ARK-0003",
        "Label" : "Couch",
        "UOM" : "PCE",
        "Industry" : "Chemicals",
        "ProductGroup" : "Homeware",
        "ProductType" : "Furniture",
        "PackagingType" : "Bulk",
        "Color" : "White",
    ],
    [
        "SKU" : "ARK-0004",
        "Label" : "Cabinet",
        "UOM" : "PCE",
        "Industry" : "Chemicals",
        "ProductGroup" : "Homeware",
        "ProductType" : "Furniture",
        "PackagingType" : "Bulk",
        "Color" : "Blue",
    ],
]

// println products.find{it->it.ProductGroup == "Office Essentials"}

// def map = [a:40, ab:20, ba:93, cb:11]
// println products.sort({it1,it2 -> it2.Color <=> it1.Color}).collect({it -> it.Color})

println products.find{it->it.Color == 'Black'}
println products.findAll{it->it.Color == 'Blue'}