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
    	CalcTwoTime start = new CalcTwoTime(8, 12, 15);	// 시작 시간
    	CalcTwoTime stop = new CalcTwoTime(12, 34, 55);	// 끝난 시간
    	CalcTwoTime diff;								// 두 시간의 차

        // difference 매서드 호출
        diff = difference(start, stop);

        System.out.printf("시간차 : %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static CalcTwoTime difference(CalcTwoTime start, CalcTwoTime stop)
    {
    	CalcTwoTime diff = new CalcTwoTime(0, 0, 0);

        // 만약 시작 시간의 초 단위가 더 크다면
        // 끝난 시간의 분 단위를 변환시키고
        // 끝난 시간의 초 단위에 더해야 한다
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        // 만약 시작 시간의 분 단위가 더 크다면
        // 끝난 시간의 시 단위를 변환시키고
        // 끝난 시간의 분 단위에 더해야 한다
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        // 시간 차를 리턴시킴
        return(diff);
    }
}


/*
시간차 : 8:12:15 - 12:34:55 = 4:22:40
*/
