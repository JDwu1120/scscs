package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wujindong on 2018/3/22.
 */
public class TriangleProblem {
    private Integer a,b,c;
    public TriangleProblem(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isTriangle(){
        if (!this.Available()){
            return false;
        }
        List<Integer> li = new ArrayList<Integer>();
        li.add(this.a);
        li.add(this.b);
        li.add(this.c);
        Collections.sort(li);
        int a,b,c,sum,sub;
        a = li.get(0);
        b = li.get(1);
        c = li.get(2);
        sum = a+b;
        sub = c-a;
        if (sum<=c){
            return false;
        }
        if (sub>=b){
            return false;
        }
        return true;
    }

    public boolean Available(){
        if(this.a<=0||this.b<=0||this.c<=0){
            return false;
        }
        return true;
    }
}


