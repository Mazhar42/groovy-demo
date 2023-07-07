class ClosureDemo {
    static void main(String[] args){
        def arr = [2,4,56,7,3,6,45,34,44,5,21];

        println "The list of even numbers:"
        arr.each{it -> if(it%2 == 0) println it}

        println "The list of odd numbers:"
        arr.each{it -> if(it%2 == 1) println it}

    }
}