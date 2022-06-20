package com.MostlyBook.shop;

import android.content.Intent;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.MostlyBook.shop.Model.AdminOrders;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Kelas AdminAddNewOrdersActivity.java untuk admin mengelola order baru
 */
public class AdminNewOrdersActivity extends AppCompatActivity {
    private RecyclerView ordersList;
    private DatabaseReference ordersRef;

    /**
     *
     * @param savedInstanceState
     *          create instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_new_orders);
        ordersRef = FirebaseDatabase.getInstance().getReference().child("Orders");
        ordersList = findViewById(R.id.orders_list);
        ordersList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<AdminOrders> options=
                new FirebaseRecyclerOptions.Builder<AdminOrders>()
                        .setQuery(ordersRef, AdminOrders.class)
                        .build();
        FirebaseRecyclerAdapter<AdminOrders, AdminOrdersViewHolder> adapter =
                new FirebaseRecyclerAdapter<AdminOrders, AdminOrdersViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull AdminOrdersViewHolder holder, final int position, @NonNull final AdminOrders model) {

                        holder.userName.setText("Name"+" "+": "+model.getName());
                        holder.userPhoneNumber.setText("Phone"+"\t\t\t\t\t\t\t\t\t\t\t\t"+": "+model.getPhone());
                        holder.userTotalPrice.setText("Total Price"+"\t\t\t\t\t\t\t\t"+": Rp."+model.getTotalAmount());
                        holder.userDateTime.setText("Order at"+"\t\t\t\t\t\t\t\t\t\t\t"+": "+model.getDate()+" "+ model.getTime());
                        holder.userShippingAddress.setText("Shipping Address"+"\t\t"+": "+model.getAddress()+", "+model.getCity());
                        holder.showOrdersBtn.setOnClickListener(view -> {
                            String uID = getRef(position).getKey();
                            Intent intent = new Intent(AdminNewOrdersActivity.this,AdminUserProductsActivity.class);
                            intent.putExtra("uid",uID);
                            startActivity(intent);
                        });


                        holder.ConfirmOrdersBtn.setOnClickListener(view -> {

                            CharSequence options1[] =new CharSequence[]{
                                    "Yes",
                                    "No"

                            };

                            AlertDialog.Builder builder = new AlertDialog.Builder(AdminNewOrdersActivity.this);
                            builder.setTitle("Have you shipped this order products?");
                            builder.setItems(options1, (dialogInterface, i) -> {
                                if (i==0){
                                    String uID = getRef(position).getKey();
                                    RemoverOrder(uID);

                                }
                                else {
                                    finish();
                                }

                            });
                            builder.show();
                        });

                    }

                    @NonNull
                    @Override
                    public AdminOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_layout,parent,false);
                        return new AdminOrdersViewHolder(view);
                    }
                };
        ordersList.setAdapter(adapter);
        adapter.startListening();

    }



    public static class AdminOrdersViewHolder extends RecyclerView.ViewHolder{

        public TextView userName, userPhoneNumber,userTotalPrice,userDateTime,userShippingAddress;
        public Button showOrdersBtn;
        public Button ConfirmOrdersBtn;
        public AdminOrdersViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.order_user_name);
            userPhoneNumber = itemView.findViewById(R.id.order_phone_number);
            userTotalPrice = itemView.findViewById(R.id.order_total_price);
            userDateTime = itemView.findViewById(R.id.order_date_time);
            userShippingAddress = itemView.findViewById(R.id.order_address_city);
            showOrdersBtn = itemView.findViewById(R.id.show_all_product_btn);
            ConfirmOrdersBtn = itemView.findViewById(R.id.confirm_btn);
        }
    }
    private void RemoverOrder(String uID) {
        ordersRef.child(uID).removeValue();
    }
}
