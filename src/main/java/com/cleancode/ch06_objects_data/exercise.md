# Chapter 6 Objects and Data Structures Exercise (လေ့ကျင့်ခန်း)

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

Data Structure လား၊ Object လား မကွဲပြားဘဲ ရောနှောနေသော ကုဒ်ဖြစ်နေသည်။

```java
public class Square {
    public double topLeftX;
    public double topLeftY;
    public double side;
}
// Square ၏ Area ကို တွက်ရန် වෙනခြား class မှ လှမ်းတွက်ခြင်း (Procedural Approach)
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
Object-Oriented သဘောတရားအရ Data များကို Private ထားပြီး Area တွက်သည့် လုပ်ဆောင်ချက် (behavior) ကို Object အတွင်းသို့ ထည့်သွင်းပေးပါ။
