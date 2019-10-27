public class GenericAddArr {

    static <T> T sum(T[] arr){

        if(arr[0] instanceof Integer){
            Integer sum = 0;
            for (T x : arr) {
                int ele = (Integer) (x);
                sum = sum + ele;
            }
            return ((T) sum);
        } else if(arr[0] instanceof Float) {
            Float sum = 0.0f;
            for (T x : arr){
                float ele = (Float) (x);
                sum = sum + ele;
            }
            return ((T) sum);
        } else if(arr[0] instanceof Double) {
            Double sum = 0.0;
            for (T x : arr){
                double ele = (Double) (x);
                sum = sum + ele;
            }
            return ((T) sum);
        }
        else
        return null;
    }

    public static void main(String args[]){

        Integer intArr[]={1,2,33,4,5};
        Float floatArr[]={1.1f,2.1f,3.1f,4.1f,5.1f};
        Double doubleArr[]={1.1,2.1,3.1,4.1,5.1};
        int i_sum = (Integer) (sum(intArr));
        float f_sum = (Float) (sum(floatArr));
        double d_sum = (Double) (sum(doubleArr));
        System.out.println("Sum="+i_sum);
        System.out.println("Sum="+f_sum);
        System.out.println("Sum="+d_sum);

    }
}
