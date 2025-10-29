package gk1.NguyenQuocGiakhang;
public class ThuocItem {
    private String title;
    private String time;
    private int imageResId;

    public ThuocItem(String title, String time, int imageResId) {
        this.title = title;
        this.time = time;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public int getImageResId() {
        return imageResId;
    }
}
