package programizExample;

// 서로 다른 두 시각의 차 계산하기

public class CalcTwoTime {

    int seconds;
    int minutes;
    int hours;

    
    public CalcTwoTime(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        
    }

    public static void main(String[] args) {

      // CalcTwoTime 클래스의 객체 생성
    	CalcTwoTime start = new CalcTwoTime(8, 12, 15);
    	CalcTwoTime stop = new CalcTwoTime(12, 34, 55);
    	CalcTwoTime diff;

        // difference 매서드 호출
        diff = difference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static CalcTwoTime difference(CalcTwoTime start, CalcTwoTime stop)
    {
    	CalcTwoTime diff = new CalcTwoTime(0, 0, 0);

        // if start second is greater
        // convert minute of stop into seconds
        // and add seconds to stop second
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        // if start minute is greater
        // convert stop hour into minutes
        // and add minutes to stop minutes
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        // return the difference time
        return(diff);
    }
}
