# instructions

DebitCard extends Account, even though not is-a Account.  Should compose and delegate to a Type/Interface (Dependency Injection, achieving Dependency Inversion and OCP.

Replace Inheritance of Account with Delegation
1. Select DebitCard
2. Right click, mouse down to Refactor
3. Select Replace Inheritance with Delegation…
4. Check the box next to getBalance()
5. click Refactor

Extract Account construction as a Parameter/Argument
1. Add "this." in front of account reference
2. Select new Account(…) expression
3. Right click, mouse down Refactor
4. Select Introduce Parameter…
5. in rename modal, double click "account"
(refactoring should complete automatically)

Change field type to interface
1. Double click Account
2. Right click and scroll to Refactor
3. Select Extract Interface…
4. Change the name of the interface to IAccount
4. Check the box next to getBalance()
5. click Refactor
6. In the popup "Analyze and Replace Usages" select Yes
7. In the popup "Rename Variables" select OK
8. At bottom left, click Do Refactor
