import java.util.*;

public class Employemain {
    public static void main(String[] args) {
        List<Employee>li= new ArrayList<>();
        Employee emp1= new Employee(100,8000);
        Employee emp2= new Employee(100,8001);
        Employee emp3= new Employee(100,8002);
        Employee emp4= new Employee(200,9000);
        Employee emp5= new Employee(200,9001);
        Employee emp6= new Employee(200,9002);
        Employee emp7= new Employee(300,8000);
        Employee emp8= new Employee(300,8000);
        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        li.add(emp4);
        li.add(emp5);
        li.add(emp6);
        li.add(emp7);
        li.add(emp8);

        HashMap<Integer,List<Employee>>map= new HashMap<>();


        for(Employee e1:li){

            if(map.containsKey(e1.deptid)){
                List<Employee>li2=map.get(e1.deptid);
                li2.add(e1);
                map.put(e1.deptid,li2);
            }else{
                List<Employee>li1= new ArrayList<>();
                li1.add(e1);
                map.put(e1.deptid,li1);
            }
        }
        System.out.println(map);
       Set<Integer>se= map.keySet();
       for(Integer i:se){
           List<Employee> li3= map.get(i);
        Optional<Employee> oi  =li3.stream().max(((o1, o2) -> o1.salary-o2.salary));
           System.out.println(oi);
       }


    }
}
