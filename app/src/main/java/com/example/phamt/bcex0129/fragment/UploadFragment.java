package com.example.phamt.bcex0129.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.phamt.bcex0129.R;

/**
 * Created by phamt on 2018/01/12.
 */

public class UploadFragment extends Fragment {

    /**
     * Root View
     */
    private View mRootView = null;

    private GridView mImageGridview = null;
    private FloatingActionButton mFloatAddButton = null;

    Integer[] imageArray = {R.drawable.pic1, R.drawable.pic2,
            R.drawable.pic3, R.drawable.pic4,
            R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8,
            R.drawable.pic9, R.drawable.pic10, R.drawable.pic11};

    public static UploadFragment newInstance() {
        UploadFragment mUpload = new UploadFragment();
        return mUpload;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return mRootView = inflater.inflate(R.layout.upload, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);

        mImageGridview = (GridView) mRootView.findViewById(R.id.image_gridview);
        mImageGridview.setAdapter(new ImageAdapterGridView(getContext()));

        mImageGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {

            }
        });

        mFloatAddButton = (FloatingActionButton) mRootView.findViewById(R.id.upload_add_float_button);
        mFloatAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(i);


            }
        });

    }

    public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;

        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return imageArray.length - 1;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView mImageView;

            if (convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(350, 350));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(16, 16, 16, 16);
            } else {
                mImageView = (ImageView) convertView;
            }
//            if(position>imageArray.length){
//                return null;
//            } else {
            mImageView.setImageResource(imageArray[position]);
            Log.v("UploadFragment", "test :" + imageArray[position]);
            return mImageView;
//            }
        }
    }

}

