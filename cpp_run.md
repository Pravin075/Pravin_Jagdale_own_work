## Running of CPP by linux commands

**First we have to connect `EC2` (Created on aws) with `MobaXterm`.**

# GO THROUGH FOLLOWING STEPS

**Step 1:-** `sudo su`           (must go to admin user first)

---
**Step 2:-** `cd ~`              (go to root user to check whether developer kit avilable or not)

---
**Step 3:-** `g++ --version`     (check the version of cpp developement kit if present go to *step7* else go to *step4*)

---
**step 4:-** `yum update`

---
**step 5:-** `yum groupinstall "Developement Tools"` (install developement kit)

---
**Step 6:-** `g++ --version`     (again check version after installation)

---
**Step 7:-** `vi 2nd.cpp`        (create a cpp file of name 2nd)

---
**Step 8:-**  Press `i`          (press i to enable other keys & to write code)

---
**Step 9:-** ```
             #include<iostream>               
             using namespace std;
             int main()
             {
             cout<<"its a demo program"<<endl;
             int 0;
             // you can write any code here
             }
             ```
             
             ---
**step 10:-** Press `esc`              (after writing code press esc to get control out of writing code)

---
**step 11:-** `:wq`                    (w=saves the written code and q=to exit the control)

---
**Step 12:-** `g++ 2nd.cpp .o 2nd`     (compile the code)

---
**Step 13:-** `./2nd`                  (run the code)

---

*OUTPUT* : its a demo program          (output of program)

                                                     *END*
