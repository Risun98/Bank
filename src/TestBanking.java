import com.atguigu.bank.Account;
import com.atguigu.bank.Bank;
import com.atguigu.bank.CheckingAccount;
import com.atguigu.bank.Customer;
import org.junit.Test;

public class TestBanking {

    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = customer.setAccount(new CheckingAccount(3000, 1000));
        account.withdraw(300);
        account.deposit(500);
        account.withdraw(4000);
        account.deposit(5000);
        account.withdraw(6000);

    }

    @Test
    public void t() {
        Bank bank = new Bank();

        // Add Customer Jane, Simms
        bank.addCustomer("Jane","Simms");
        //code
        //Add Customer Owen, Bryant
        bank.addCustomer("Owen","Bryant");
        bank.addCustomer("Tim","Soley");
        bank.addCustomer("Maria","Soley");
        //code
        // Add Customer Tim, Soley
        //code
        // Add Customer Maria, Soley
        //code
        for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
