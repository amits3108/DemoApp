package com.example.amit.demo.activity;

import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import com.example.amit.demo.R;
import com.example.amit.demo.fragment.FragmentOne;
import com.example.amit.demo.utils.Constants;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {
    private int Nnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ","1");
//        addFragment();

//        main();
//        main2();
        final EditText editText = (EditText)findViewById(R.id.edtText);
        Button submit = (Button)findViewById(R.id.buton);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nnumber = Integer.parseInt(editText.getText().toString());
//                logic1();
//                logic2();
//                logic3();
//                logic4();
            }
        });


        ///Composition example.
//        ClassC obj1 = new ClassC(new ClassA());
//        ClassC obj2 = new ClassC(new ClassB());
//
//        obj1.test();
//        obj2.test();

        ///ConcurrentHashMapExample
//        ConcurrentHashMapExample.main();

//        MyEnumeration.main();
//        MyObjectKeySearch.main();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ","2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ","3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ","4");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ","5");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ","6");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ","7");
    }

    public void addFragment(){
        FragmentOne FragmentOne = com.example.amit.demo.fragment.FragmentOne.getInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fl_fragment, FragmentOne, Constants.FRAGMENT_ONE);
        fragmentTransaction.commit();
    }

    public void main() {
        int[][] arr = {{1, 2}, {3, 4}, {9, 10}, {11, 12}};
        boolean found = false;
        int row = 0;
        int col = 0;
        //find index of first int greater than 10
        searchint:

        for (row=0; row < arr.length; row++) {
            for (col=0; col < arr[row].length; col++) {
                if (arr[row][col] > 10) {
                    found = true;
                    //using break label to terminate outer statements
                    break searchint;
                }
            }
        }
        if (found)
            System.out.println("First int greater than 10 is found at index: [" + row + "," + col +
                    "]");
    }


    public void main2() {
        String[] arr = {"A", "E", "I", "O", "U"};

        statbreak1:

        //find O in the array using for loop
        for(int len=0; len < arr.length; len++){
            if(arr[len].equals("O")){
                System.out.println("Array contains 'O' at index: "+len);
                //break the loop as we found what we are looking for
                break statbreak1;
            }
        }



        //use of break in while loop
        int len=0;
        statbreak:
        while(len < arr.length){
            if(arr[len].equals("E")){
                System.out.println("Array contains 'E' at index: "+len);
                //break the while loop as we found what we are looking for
                break statbreak;
            }
            len++;
        }

        len = 0;
        //use of break in do-while loop
        statbreak3:
        do{
            if(arr[len].equals("U")){
                System.out.println("Array contains 'U' at index: "+len);
                //break the while loop as we found what we are looking for
                break statbreak3;
            }
            len++;
        }while(len < arr.length);
    }

    private void logic1() {
        for (int i = 0; i <= Nnumber; i++) {
            for (int k = 0; k < Nnumber - i; k++) {
                System.out.print(" ");
            }
            for (int j = Nnumber - i; j <= Nnumber + i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void logic2() {
        for (int i = 0; i < Nnumber; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= Nnumber - i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    private void logic3() {
        for (int i = 0; i <= (Nnumber / 2); i++) {
            for (int k = 0; k <= (Nnumber / 2) - i; k++) {
                System.out.print(" ");
            }

            for (int j = (Nnumber / 2) - i; j <= (Nnumber / 2) + i; j++) {
                System.out.print("*");
            }

//            for(int m = 0; m <=;m++){
//                System.out.print(" ");
//            }

            System.out.print("\n");
        }
    }

    private void logic4(){

//        for(int i=1;i<=Nnumber;i++){
//            int j;
//            for(j=1;j<=Nnumber-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=j;k<=Nnumber;k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        for (int i = 1; i <= Nnumber; i++) {
            for (int j = 1; j <= Nnumber; j++) {
                if (j <= Nnumber - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}





 abstract class SuperClass {

    public abstract void doSomething();
}

class ClassA extends SuperClass{

    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of A");
    }

    //ClassA own method
    public void methodA(){

    }
}

class ClassB extends SuperClass{

    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of B");
    }

    //ClassB specific method
    public void methodB(){

    }
}
//class ClassC extends ClassB{
//    public void test(){
//        //calling super class method
//        doSomething();
//    }
//}


 interface InterfaceA {

    public void doSomething();
}

 interface InterfaceB {

    public void doSomething();
}

interface InterfaceC extends InterfaceA, InterfaceB {

    //same method is declared in InterfaceA and InterfaceB both
    public void doSomething();

}

class ClassC{

    SuperClass obj = null;

    public ClassC(SuperClass o){
        this.obj = o;
    }
    public void test(){
        obj.doSomething();
    }

//    public static void main(String args[]){
//        ClassC obj1 = new ClassC(new ClassA());
//        ClassC obj2 = new ClassC(new ClassB());
//
//        obj1.test();
//        obj2.test();
//    }
}



 class ConcurrentHashMapExample {
     public void confunction(){
         System.out.println(" confunction functin");
     }

    public static void main() {

        //ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);

        //HashMap
        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        myMap.put(null, null);
        myMap.put("sdf", null);
        myMap.put("ads", null);
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

//        while(it1.hasNext()){
//            String key = it1.next();
//            if(key.equals("3")){
//                myMap.put(key, "new3");
//                break;
//            }
//        }
        System.out.println("HashMap after iterator: "+myMap);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(" System hashset values : "+hashSet);
    }
}


class MyEnumeration {
    public void myfunction(){
        System.out.println(" myanumeration functin");
    }
    public void confunction(){
        System.out.println(" confunction functin");
    }

    public static void main(){
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        en = lang.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}

class A{

}
class B extends A{

}

class C{
    A a1 = new B();
    B b1 = (B) new A();
}