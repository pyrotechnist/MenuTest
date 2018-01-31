package com.example.longyuan.menutest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TestFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public TestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TestFragment newInstance() {
        TestFragment fragment = new TestFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_test, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.textView_html);

        TextView Text = (TextView) rootView.findViewById(R.id.textView_text);

        String html = "<p>Hi,<br/>Do you think you could get a logcat during the crash? That seems really strange, especially the fact that it makes Android reboot.<br/>You can get the SDK here: http://developer.android.com/sdk/index.html<br/>(needed for logcat)</p>";

        String html2 = "<br/><br/><center><table border=\"0\" width=\"50%\" cellspacing=\"0\" cellpadding=\"0\"><tr><td>&nbsp;&nbsp;引用[<a href=\"redirect.php?goto=findpost&fid=&ptid=10632532&pid=14875219\">查看原帖</a>]:</td></tr><tr><td><table border=\"0\" width=\"100%\" cellspacing=\"1\" cellpadding=\"10\" bgcolor=\"BORDERCOLOR\"><tr><td width=\"100%\" bgcolor=\"ALTBG2\"><b>xujun8110</b> 2018-1-30 14:24<br />头条的强度。。 </td></tr></table></td></tr></table></center><br/>强度如何呢？现在没有朋友在里面我也打听不到SSASASASASASASASASA" ;


        Pattern p = Pattern.compile("(.*<\\/table><\\/center><br\\/>)(.*)");
        Matcher m = p.matcher(html2);

        if(m.find())
        {
            String g1 = m.group(1);

            textView.setText(Html.fromHtml(g1));

            String g2 = m.group(2);

            Text.setText(g2);
        }

        return rootView;
    }

}
