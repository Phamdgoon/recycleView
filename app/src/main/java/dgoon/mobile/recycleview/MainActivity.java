package dgoon.mobile.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.util.ULocale;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv_category;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_category = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        rcv_category.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getDataList());
        rcv_category.setAdapter(categoryAdapter);
    }

    private List<ULocale.Category> getDataList() {
        List<ULocale.Category> list = new ArrayList<>();

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(R.drawable.bo,"Thịt bòa"));
        bookList.add(new Book(R.drawable.bido,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.chuoi,"spaghetti"));
        bookList.add(new Book(R.drawable.thom,"nui"));


        bookList.add(new Book(R.drawable.bo,"Thịt bòa"));
        bookList.add(new Book(R.drawable.bido,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.chuoi,"spaghetti"));
        bookList.add(new Book(R.drawable.thom,"nui"));


        bookList.add(new Book(R.drawable.bo,"Thịt bòa"));
        bookList.add(new Book(R.drawable.bido,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.chuoi,"spaghetti"));
        bookList.add(new Book(R.drawable.thom,"nui"));


        list.add(new Category("Món ăn ngon",bookList));
        list.add(new Category("Món ăn ngon",bookList));
        list.add(new Category("Món ăn ngon",bookList));

        return list;
    }
}