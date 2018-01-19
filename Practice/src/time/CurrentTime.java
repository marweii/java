package time;

public class CurrentTime {
    public static void main(String[] args){
        /**
         * System.currentTimeMillis返回的是从1970.1.1 UTC 零点开始到现在的时间，
         * 精确到毫秒，平时我们可以根据System.currentTimeMillis来计算当前日期，
         * 星期几等，可以方便的与Date进行转换
         */
        System.out.println(System.currentTimeMillis());
        /**
         *  System.nanoTime提供相对精确的计时，但是不能用他来计算当前日期，
         所以在使用中，我们可以根据我们具体的目的去正确的选择他们
         */
        System.out.println(System.nanoTime());
    }
}
