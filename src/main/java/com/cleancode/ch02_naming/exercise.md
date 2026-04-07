# Chapter 2 Naming Exercise (လေ့ကျင့်ခန်း)

အောက်ပါ `Dirty Code` (မကောင်းသော ကုဒ်) များကို Clean Code (ကောင်းမွန်သော ကုဒ်) ဖြစ်အောင် ပြင်ဆင်ရေးသားပါ။ အမည်ပေးခြင်း (Naming Conventions) စည်းမျဉ်းများကို အသုံးပြုပါ။

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

အောက်ပါ Java class တွင် အဓိပ္ပါယ်မရှိသော အမည်များ၊ အသံထွက်ဖတ်ရန် ခက်ခဲသော အမည်များနှင့် ရည်ရွယ်ချက် မထင်ရှားသော အမည်များကို အသုံးပြုထားသည်။

```java
public class DtaRcrd102 {
    private Date modymdd;
    private int p_id;
    private String nameString;
    private List<int[]> list1;

    public DtaRcrd102(Date modymdd, int p_id, String nameString) {
        this.modymdd = modymdd;
        this.p_id = p_id;
        this.nameString = nameString;
        this.list1 = new ArrayList<>();
    }

    public List<int[]> getThem() {
        List<int[]> list2 = new ArrayList<>();
        for (int[] x : list1) {
            if (x[0] == 4) {
                list2.add(x);
            }
        }
        return list2;
    }
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
`dirty` package အောက်ရှိ code များကို သွားရောက်ပြီး ရည်ရွယ်ချက်ပေါ်လွင်သော အမည်များ (Intention-Revealing Names) ဖြင့် ပြင်ဆင်ရေးသားပါ။ ဥပမာ - `DtaRcrd102` အစား `Employee` စသည်ဖြင့် ပြောင်းလဲပေးပါ။
