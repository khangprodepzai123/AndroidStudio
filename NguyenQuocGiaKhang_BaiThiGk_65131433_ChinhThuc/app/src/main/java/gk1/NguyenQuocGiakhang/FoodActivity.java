package gk1.NguyenQuocGiakhang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    ListView listView;
    String[] subjects = {
            "Phở bò Hà Nội",
            "Bánh mì Việt Nam",
            "Cơm tấm Sài Gòn",
            "Gỏi cuốn",
            "Bún chả",
            "Trà sữa trân châu"
    };

    String[] descriptions = {
            "Phở bò truyền thống với nước dùng đậm đà, thịt bò tái hoặc chín, hành lá và chanh ớt đặc trưng của ẩm thực Hà Nội.",
            "Ổ bánh mì giòn rụm, nhân gồm thịt, pate, dưa leo, đồ chua và nước sốt đặc biệt – được mệnh danh là món ăn đường phố ngon nhất thế giới.",
            "Cơm tấm thơm ngon ăn cùng sườn nướng, bì, chả trứng và nước mắm tỏi ớt, đặc sản quen thuộc của người Sài Gòn.",
            "Món ăn thanh mát gồm tôm, thịt, bún, rau thơm cuộn trong bánh tráng, chấm cùng nước mắm hoặc tương đặc biệt.",
            "Thịt nướng than hoa ăn cùng bún, rau sống và nước mắm chua ngọt – món ngon đặc sản Hà Nội khiến du khách mê mẩn.",
            "Thức uống nổi tiếng gồm trà, sữa và hạt trân châu dẻo dai, có nhiều hương vị đa dạng được giới trẻ yêu thích."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        listView = findViewById(R.id.listView4);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjects
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = subjects[position];
                String desc = descriptions[position];

                Toast.makeText(FoodActivity.this, "Bạn chọn: " + selected, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(FoodActivity.this, ItemFoodActivity.class);
                intent.putExtra("subject_name", selected);
                intent.putExtra("subject_desc", desc);
                startActivity(intent);
            }
        });
    }
}
