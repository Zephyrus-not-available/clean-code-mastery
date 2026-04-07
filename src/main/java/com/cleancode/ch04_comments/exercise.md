# Chapter 4 Comments Exercise (လေ့ကျင့်ခန်း)

အကောင်းဆုံး Comment ဆိုတာ မလိုဘဲ ကုဒ်က သူ့ဘာသာ ရှင်းပြနေတဲ့ ကုဒ်မျိုးဖြစ်ပါတယ်။ (Code as documentation).

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

အောက်ပါ ကုဒ်တွင် မလိုအပ်သော၊ ရှုပ်ထွေးသော comment များပါဝင်နေသည်။

```java
// Check to see if the employee is eligible for full benefits
if ((employee.flags & HOURLY_FLAG) != 0 && 
    (employee.age > 65)) {
    // ...
}

// Default constructor
public User() {}

// returns the name
public String getName() {
    return this.name;
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
1. ရှင်းလင်းစွာရေးထားသော Method လေးများ (ဥပမာ `isEligibleForFullBenefits()`) တည်ဆောက်ပြီး comment ကို ဖယ်ရှားပါ။
2. Getter/setter နှင့် တိုက်ရိုက်သိသာသော နေရာများမှ ဆူညံသော comment (Noise comments) များကို ရှင်းလင်းပါ။
