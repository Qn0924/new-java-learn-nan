public class Time2 <H,M,S>{
    //定义成员变量用泛型
    private H hour;
    private M min;
    private S s;

    //使用get和set方法来获得和修改时分秒
    public H getHour() {
        return hour;
    }

    public void setHour(H hour) {
        this.hour = hour;
    }

    public M getMin() {
        return min;
    }

    public void setMin(M min) {
        this.min = min;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }
}
