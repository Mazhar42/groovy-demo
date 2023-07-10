class Factorial {
    static void main(String[] args){
        // def arr = [2,4,6,7,83,9,4,22,42,67] as int[];

        // for(int i=0;i<arr.size();i++){
        //     res+=a;rr[i];
        // }
        // for(def num in arr) res+=num;
        // for(def num : arr) res+=num;
        // println res; 
        // println arr.sum();

        println factorial(7)
    }

    static int factorial(int n){
        if(n<=1) return 1
        else return n * factorial(n-1)
    }
}
