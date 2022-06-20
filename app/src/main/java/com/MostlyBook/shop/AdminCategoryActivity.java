package com.MostlyBook.shop;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Kelas AdminCategoryActivity.java untuk admin menambah category product baru
 */
public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView category_art, category_business, category_comedy, category_education, category_fantasy, category_horror, category_health, category_history, category_law, category_religion, category_romance, category_technology;
    private Button LogoutBtn, CheckOrdersBtn;

    /**
     *
     * @param savedInstanceState
     *          create instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(view -> {
            Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(view -> {
            Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
            startActivity(intent);
        });


        category_art = (ImageView) findViewById(R.id.category_art);
        category_business = (ImageView) findViewById(R.id.category_business);
        category_comedy = (ImageView) findViewById(R.id.category_comedy);
        category_education = (ImageView) findViewById(R.id.category_education);

        category_fantasy = (ImageView) findViewById(R.id.category_fantasy);
        category_horror = (ImageView) findViewById(R.id.category_horror);
        category_health = (ImageView) findViewById(R.id.category_health);
        category_history = (ImageView) findViewById(R.id.category_history);

        category_law = (ImageView) findViewById(R.id.category_law);
        category_religion = (ImageView) findViewById(R.id.category_religion);
        category_romance = (ImageView) findViewById(R.id.category_romance);
        category_technology = (ImageView) findViewById(R.id.category_technology);


        category_art.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_art");
            startActivity(intent);
        });
        category_business.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_business");
            startActivity(intent);
        });


        category_comedy.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_comedy");
            startActivity(intent);
        });


        category_education.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_education");
            startActivity(intent);
        });


        category_fantasy.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_fantasy");
            startActivity(intent);
        });


        category_horror.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_horror");
            startActivity(intent);
        });



        category_health.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_health");
            startActivity(intent);
        });


        category_history.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_history");
            startActivity(intent);
        });



        category_law.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_law");
            startActivity(intent);
        });


        category_religion.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_religion");
            startActivity(intent);
        });


        category_romance.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_romance");
            startActivity(intent);
        });


        category_technology.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "category_technology");
            startActivity(intent);
        });
    }
}
