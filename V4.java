class TimeTable
{
    int year;
    String[]day={"Mon","Tue","Wed","Thu","Fri","Sat"};
    int[]period={1,2,3,4,5,6,7};
    String[] batch={"4MW24CS","4MW23CS","4MW22CS","4MW21CS"};
    String[]subject={"OOPJ,DSA,MATH,DDCO,OS,PYTHON,C"};
    String[]faculty={"Kuthyar Sir","Chitra Madam","Deepak sir","Ganesh sir","Goutham sir","Vignesh sir","Bhuvan Sir"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1)
    {
        this.year=y1;
        this.section=s1;
    }
    public void printTimeTable()
    {
        String heading=year+"-"+batch[year-1];
        System.out.println("TimeTable of Year"+heading+ " Section " +section);
        for(int i=0;i<day.length;i++)
        {
            System.out.println(day[i]+": ");
            for(int j=0;j<period.length;j++)
            {
                String currentSubject=subject[(j+i) % subject.length];
                String currentFaculty=faculty [(j+i) % faculty.length];
                //System.out.printf("%-10s",currentSubject+"\n"+currentFaculty);
                System.out.println("Period "+period[j]+": "+currentSubject+"- "+currentFaculty);
            }
            System.out.println();
        }
    }
}
public class V4
{
    public static void main(String[]args)
    {
        TimeTable tt2A=new TimeTable(2,"A");
        TimeTable tt2B=new TimeTable(2,"B");
        tt2A.printTimeTable();
        tt2B.printTimeTable();
    }
}