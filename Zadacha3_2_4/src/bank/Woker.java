package bank;

public class Woker implements BankWorker {

    public static void main(String[] args) {
        BankClient bankClient = new BankClient();
        Woker woker = new Woker();
        System.out.println(woker.getCreditForClient(woker, bankClient));
    }

    public boolean checkClientForCredit(BankClient bankClient) throws ProblemWithLowExepction, BadCreditHistoryException {

        if (bankClient.problemWithLaw == false) {
        } else {
            throw new ProblemWithLowExepction("ProblemWithLawException");
        }
        if (bankClient.badCreditHistory == false) {
        } else {
            throw new BadCreditHistoryException("BadCreditHistoryException");
        }
        return true;
    }

    public boolean getCreditForClient(BankWorker worker, BankClient bankClient) throws ProblemWithLowExepction, BadCreditHistoryException {
        try {
            if (worker.checkClientForCredit(bankClient) == true) {
                System.out.println("Кредит одобрен");
                return true;
            }
        } catch (BadCreditHistoryException e) {
            System.out.println("Плохая кредитная история");
        } catch (ProblemWithLowExepction e) {
        }
        return false;
    }
}



