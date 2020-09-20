# SupportLib
底部弹窗


## 系统弹窗sheetBottomDialog  Api


/**
 * 底部弹窗 共五个中间态
 * 1.稳态
 * State_Expanded
 * State_Collapsed
 * State_HIDDEN
 * 2.中间态
 * State_Dragging
 * State_Settling
 *
 */


    public static final int STATE_DRAGGING = 1;
    public static final int STATE_SETTLING = 2;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_HALF_EXPANDED = 6;





####  核心类  CoordinatorLayout + behavior


1.简单 BottomSheet 【非模态】

```java
    private var mBottomSheetBehavior: BottomSheetBehavior<LinearLayout> ?= null
    
     mBottomSheetBehavior= BottomSheetBehavior.from(bottom_sheet)
        mBottomSheetBehavior?.state = BottomSheetBehavior.STATE_EXPANDED

        mBottomSheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(p0: View, newState: Float) {
                Log.d("状态监听", "newState=" + newState);
            }

            override fun onStateChanged(p0: View, slideOffset: Int) {
                Log.d("偏移量监听", "onSlide=" + slideOffset);
            }

        })
        
```
        

2. BottomSheetDialog  封装了 CoordinatorLayout + behavior 只需要提供Dialog 子View，用法同Dialog。 【模态】


```java

BottomSheetDialog extends AppCompatDialog { }

```

3.BottomSheetDialogFragment 继承 DialogFragment


```java
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public BottomSheetDialogFragment() {
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new BottomSheetDialog(this.getContext(), this.getTheme());
    }
}
```



效果图


![1600600206969941](https://user-images.githubusercontent.com/7346792/93709956-57bd7180-fb75-11ea-8cd0-1510ee73128f.gif)
