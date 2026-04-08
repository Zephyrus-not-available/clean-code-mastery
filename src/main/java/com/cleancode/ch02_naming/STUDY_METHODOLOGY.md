သင်၏ **Workable Formula** ကို အခြေခံ၍ Chapter 2 (Meaningful Names) အတွက် လေ့လာမှုမှတ်တမ်း (Study Notes) ကို Markdown format ဖြင့် အောက်ပါအတိုင်း ပြင်ဆင်ပေးလိုက်ပါသည်။ ၎င်းကို `CHAPTER_02_MEANINGFUL_NAMES.md` ဟု အမည်ပေး၍ သိမ်းဆည်းနိုင်ပါသည်။

---

# 📖 Chapter 2: Meaningful Names (အဓိပ္ပာယ်ရှိသော အမည်ပေးခြင်း)

နာမည်ပေးခြင်းသည် ကုဒ်ရေးသားခြင်း၏ အခြေခံအကျဆုံးနှင့် အရေးကြီးဆုံး အစိတ်အပိုင်းဖြစ်သည်။ ဤအခန်းတွင် ကုဒ်ကို ဖတ်ရုံဖြင့် နားလည်စေမည့် နာမည်ပေးစနစ်များကို လေ့လာရမည်။

---

## ၁။ Blind Study ကို ကျော်လွှားခြင်း (Active Thinking Phase)

### 📚 Study အနှစ်ချုပ်:
* **Intention-Revealing:** နာမည်တစ်ခုသည် ၎င်း၏ ရည်ရွယ်ချက်ကို ရှင်းပြရန် Comment မလိုရပါ။ (ဥပမာ- `d` အစား `elapsedTimeInDays`)။
* **Avoid Noise Words:** `ProductInfo`, `ProductData` စသည့် `Info`, `Data` စကားလုံးများသည် အဓိပ္ပာယ်ကို မထူးခြားစေသော Noise Words များသာဖြစ်သည်။
* **Searchable Names:** Magic Numbers (ဥပမာ- `7`, `86400`) များကို နာမည်ပေးထားသော Constant များအဖြစ် ပြောင်းလဲပါ။
* **Pronounceable & Searchable:** အသံထွက်ရလွယ်ရမည်၊ IDE တွင် ရှာဖွေရလွယ်ရမည်။

### 🧠 Reflection Questions (၇ မိနစ်စဉ်းစားခြင်း):
* **Contextualizing:** "ငါ့ရဲ့ project ထဲမှာ `temp`, `data`, `list` လို့ ပေးထားတဲ့ နာမည်တွေက တခြားသူဖတ်ရင် တကယ်ရော နားလည်ပါ့မလား?"
* **Contradicting:** "နာမည်တွေကို အရမ်းရှည်အောင် ပေးလိုက်ရင် ကုဒ်ဖတ်ရတာ ပိုရှုပ်သွားမလား? (စာရေးသူ အဆိုအရ Scope ကြီးရင် နာမည်ရှည်ရမယ်၊ Scope သေးရင် နာမည်တိုလို့ရတယ်)"
* **Simplifying:** "ရည်ရွယ်ချက်ပေါ်လွင်တဲ့ နာမည်ပေးခြင်းဟာ ကုဒ်ကို 'စာအုပ်တစ်အုပ်' လို ဖတ်ရလွယ်အောင် ဘယ်လို ကူညီပေးသလဲ?"

---

## ၂။ အပိုင်း (၁) - လက်ရှိအလုပ် (Main Job) Action Plan

* **Immediate ROI:** ဒီနေ့ရေးမယ့် ကုဒ်ထဲမှာ `a1`, `a2` သို့မဟုတ် `i`, `j` (loop ထဲကလွဲ၍) စသည့် အဓိပ္ပာယ်မဲ့ နာမည်များကို `source`, `destination` စသည့် အဓိပ္ပာယ်ရှိသော နာမည်များသို့ ပြောင်းလဲမည်။
* **Kill Magic Numbers:** ကုဒ်ထဲမှာ တိုက်ရိုက်ရေးထားတဲ့ ဂဏန်းတွေကို `static final` (Java) သို့မဟုတ် `const` သုံးပြီး အဓိပ္ပာယ်ရှိသော အမည်များ ပေးမည်။
* **Documentation as Code:** Comment ရေးမည့်အစား Method/Variable နာမည်ကို ပိုရှင်းအောင် ပြင်မည်။

---

## ၃။ အပိုင်း (၂) - ဒုတိယအလုပ် (Side Project / Repo)

ဤ Repository ရှိ `exercises/chapter02` အောက်တွင် အောက်ပါတို့ကို ကျင့်သုံးမည်။

### ❌ Dirty Code Example:
```java
// What do these numbers and variables mean?
public List<int[]> getThem() {
    List<int[]> list1 = new ArrayList<int[]>();
    for (int[] x : theList)
        if (x[0] == 4)
            list1.add(x);
    return list1;
}
```

### ✅ Clean Code Example (Refactored):
```java
// Intentional naming makes the logic clear
public List<Cell> getFlaggedCells() {
    List<Cell> flaggedCells = new ArrayList<Cell>();
    for (Cell cell : gameBoard)
        if (cell.isFlagged())
            flaggedCells.add(cell);
    return flaggedCells;
}
```


---

## ၄။ အပိုင်း (၃) - Article ရေးခြင်း (Teaching to Learn)

### ✍️ Article Topic Ideas:
* **"Why `var1` is your enemy:"** နာမည်ဆိုးတွေကြောင့် ကုဒ်ပြန်ဖတ်တဲ့အခါ အချိန်ကုန်ရပုံအကြောင်း။
* **"Magic Numbers and the Grep Test:"** ဂဏန်းတွေကို နာမည်မပေးဘဲ သုံးခြင်းက ရှာဖွေရ ဘယ်လောက်ခက်ခဲကြောင်း လက်တွေ့ပြသခြင်း။
* **"The Art of Naming Classes vs Methods:"** Class တွေကို နာမ် (Noun) ပေးပြီး Method တွေကို ကြိယာ (Verb) ပေးရခြင်းရဲ့ အကျိုးကျေးဇူး။

---

## 📈 Summary (The Golden Ratio)

| လှုပ်ရှားမှု | အချိန်ပေးမှု | ရလဒ် |
| :--- | :---: | :--- |
| **Study** | ၂၀% | Chapter 2 ပါ နာမည်ပေးခြင်း စည်းကမ်း ၁၇ ခုကို သိရှိခြင်း။ |
| **Think** | ၃၀% | ကုဒ်ကို ဖတ်ရုံဖြင့် နားလည်နိုင်စွမ်း (Code-sense) တက်လာခြင်း။ |
| **Apply** | ၅၀% | `dirty` မှ `clean` သို့ ပြောင်းလဲနိုင်သော လက်တွေ့ Skill ရရှိခြင်း။ |

---

> **“The name of a variable, function, or class, should answer all the big questions. It should tell you why it exists, what it does, and how it is used.”** — Robert C. Martin
