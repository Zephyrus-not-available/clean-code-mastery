# Chapter 3 Functions Exercise (လေ့ကျင့်ခန်း)

Functions များသည် တိုတောင်းရမည်၊ အလုပ်တစ်ခုတည်းကိုသာ လုပ်ရမည် (Do One Thing)။

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

အောက်ပါ Method သည် အလွန်ရှည်လျားပြီး အလုပ်များစွာကို ရောထွေးလုပ်ဆောင်နေသည်။

```java
public void processPayroll(Employee e, boolean isSalaried) {
    // 1. Calculate pay
    double pay = 0;
    if (isSalaried) {
        pay = e.getBaseSalary();
    } else {
        pay = e.getHours() * e.getRate();
    }
    
    // 2. Tax deduction
    double tax = 0;
    if (pay > 1000) {
        tax = pay * 0.2;
    } else {
        tax = pay * 0.1;
    }
    double netPay = pay - tax;
    
    // 3. Print receipt
    System.out.println("Employee: " + e.getName());
    System.out.println("Pay: " + netPay);
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
`dirty` package ���ောက်ရှိ code ကိုသွား၍:
1. `calculatePay`, `calculateTax`, `printReceipt` စသည့် သေးငယ်သော Method လေးများအဖြစ် (Extract Method) ခွဲထုတ်ပါ။
2. ရှင်းလင်းလွယ်ကူစွာ ဖတ်နိုင်အောင် ပြင်ဆင်ပါ။
