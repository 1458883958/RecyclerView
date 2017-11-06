package com.example.wudelin.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    private RecyclerView recyclerviewtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        recyclerviewtest = (RecyclerView) this.findViewById(R.id.recycler_View);

        //用于指定RecyclerView的布局方式 ----------水平
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //recyclerviewtest.setLayoutManager(layoutManager);

        //瀑布式布局
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerviewtest.setLayoutManager(layoutManager);
        recyclerviewtest.setAdapter(fruitAdapter);
    }

    private void initFruits() {
        for(int i=0;i<4;i++){
            Fruit apple = new Fruit(R.mipmap.apple,getRandomLengthName("Apple"));
            fruitList.add(apple);
            Fruit banana = new Fruit(R.mipmap.banana,getRandomLengthName("Banana"));
            fruitList.add(banana);
            Fruit orange = new Fruit(R.mipmap.orange,getRandomLengthName("Orange"));
            fruitList.add(orange);
            Fruit patatol = new Fruit(R.mipmap.patatol,getRandomLengthName("Patatol"));
            fruitList.add(patatol);

        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
