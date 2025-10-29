package gk1.NguyenQuocGiakhang;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ThuocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thuoc);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ThuocItem> list = new ArrayList<>();
        list.add(new ThuocItem("Thuốc giảm đau", "Hạn dùng: 10/03/2025", R.drawable.ic_launcher_foreground));
        list.add(new ThuocItem("Vitamin C", "Hạn dùng: 20/04/2025", R.drawable.ic_launcher_foreground));
        list.add(new ThuocItem("Thuốc kháng sinh", "Hạn dùng: 01/05/2025", R.drawable.ic_launcher_foreground));

        ThuocAdapter adapter = new ThuocAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}
