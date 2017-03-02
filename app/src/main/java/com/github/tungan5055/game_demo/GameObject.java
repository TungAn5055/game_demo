package com.github.tungan5055.game_demo;

import android.graphics.Bitmap;
/**
 * Created by TungAn on 2/28/2017.
 */

public class GameObject {
    protected Bitmap image;
// Số hàng số cột của ảnh
    protected final int rowCount;
    protected final int colCount;
// thông số của toàn bộ ảnh
    protected final int WIDTH;
    protected final int HEIGHT;
// thông số của ảnh con sẽ cắt từ ảnh to
    protected final int width;
    protected final int height;
// Tọa độ trên screen
    protected int x;
    protected int y;
//  tách lấy nhân vật.
    public GameObject(Bitmap image, int rowCount, int colCount, int x, int y)  {

        this.image = image;
        this.rowCount= rowCount;
        this.colCount= colCount;

        this.x= x;
        this.y= y;

        this.WIDTH = image.getWidth();
        this.HEIGHT = image.getHeight();

        this.width = this.WIDTH/ colCount;
        this.height= this.HEIGHT/ rowCount;
    }

// Khởi tạo một bitmap chứa thông tin của ảnh, như kích thước,
    protected Bitmap createSubImageAt(int row, int col)  {
        // createBitmap(bitmap, x, y, width, height).
        Bitmap subImage = Bitmap.createBitmap(image, col* width, row* height ,width,height);
        return subImage;
    }

    public int getX()  {
        return this.x;
    }

    public int getY()  {
        return this.y;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
