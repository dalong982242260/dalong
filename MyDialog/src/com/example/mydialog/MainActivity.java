package com.example.mydialog;
/**
 * name��dalong
 * date��2014/12/3
 * QQ��982242260
 */
import com.example.mydialog.MyDialog.DialogItemClickListener;
import com.example.mydialog.MyDialog.OnAlertViewClickListener;
import com.example.mydialog.MyDialog.OnTimeAlertViewClickListener;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnOpen1, btnOpen2, btnOpen3, btnOpen4,btnOpen5,btnOpen6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnOpen1 = (Button) this.findViewById(R.id.btnOpen1);
		btnOpen2 = (Button) this.findViewById(R.id.btnOpen2);
		btnOpen3 = (Button) this.findViewById(R.id.btnOpen3);
		btnOpen4 = (Button) this.findViewById(R.id.btnOpen4);
		btnOpen5 = (Button) this.findViewById(R.id.btnOpen5);
		btnOpen6 = (Button) this.findViewById(R.id.btnOpen6);
		btnOpen1.setOnClickListener(this);
		btnOpen2.setOnClickListener(this);
		btnOpen3.setOnClickListener(this);
		btnOpen4.setOnClickListener(this);
		btnOpen5.setOnClickListener(this);
		btnOpen6.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnOpen1:
			MyDialog.showAlertView(this, 0, "ɾ���ɹ�", null, "ȷ   ��", null, new OnAlertViewClickListener() {
				@Override
				public void confirm(String result) {}
				@Override
				public void cancel() {
					Toast.makeText(MainActivity.this, "ɾ���ɹ�", 1).show();
				}
			});
			break;
		case R.id.btnOpen2:
			MyDialog.showAlertView(this, R.drawable.dialog_icon, "ɾ���ɹ�", null, "ȷ   ��", null, new OnAlertViewClickListener() {
				@Override
				public void confirm(String result) {}
				@Override
				public void cancel() {
					Toast.makeText(MainActivity.this, "ɾ���ɹ�", 1).show();
				}
			});
			break;
		case R.id.btnOpen3:
			MyDialog.showAlertView(this, R.drawable.dialog_icon, "ɾ���ɹ�", null, "ȡ��", new String[]{"ȷ��"}, new OnAlertViewClickListener() {
				@SuppressLint("ShowToast")
				@Override
				public void confirm(String result) {
					if(result.equals("ȷ��")){
						Toast.makeText(MainActivity.this, result, 1).show();
					}
				}
				@SuppressLint("ShowToast")
				@Override
				public void cancel() {
					Toast.makeText(MainActivity.this, "ȡ��", 1).show();
				}
			});
			break;
		case R.id.btnOpen4:
			MyDialog.showTimeAlertDialog(this, 0, "ɾ���ɹ�", "����Զ���תҳ���", "�ֶ���ת", 5, new OnTimeAlertViewClickListener() {
				@Override
				public void confirm() {
					Toast.makeText(MainActivity.this, "ɾ���ɹ�", 1).show();
				}
			});
			break;
		case R.id.btnOpen5:
			MyDialog.ShowDialog(this, "", new String[]{"��","Ů"}, new DialogItemClickListener() {
				@Override
				public void confirm(String result) {
					Toast.makeText(MainActivity.this,result, 1).show();
				}
			});
			break;
		case R.id.btnOpen6:
			MyDialog.ShowDialog(this, "��ѡ���Ա�", new String[]{"��","Ů"}, new DialogItemClickListener() {
				@Override
				public void confirm(String result) {
					Toast.makeText(MainActivity.this,result, 1).show();
				}
			});
			break;
		}

	}


}
