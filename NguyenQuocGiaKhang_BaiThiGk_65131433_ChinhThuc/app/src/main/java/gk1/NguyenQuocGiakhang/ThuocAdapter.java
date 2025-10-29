package gk1.NguyenQuocGiakhang;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThuocAdapter extends RecyclerView.Adapter<ThuocAdapter.ViewHolder> {
    private Context context;
    private List<ThuocItem> thuocList;

    public ThuocAdapter(Context context, List<ThuocItem> thuocList) {
        this.context = context;
        this.thuocList = thuocList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_thuoc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ThuocItem item = thuocList.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvTime.setText(item.getTime());
        holder.imgThumb.setImageResource(item.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, "Đã chọn: " + item.getTitle(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context, ItemThuocActivity.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("time", item.getTime());
            intent.putExtra("imageResId", item.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return thuocList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvTime;
        ImageView imgThumb;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvTime = itemView.findViewById(R.id.tvTime);
            imgThumb = itemView.findViewById(R.id.imgThumb);
        }
    }
}
