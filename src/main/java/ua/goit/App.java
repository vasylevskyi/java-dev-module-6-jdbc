package ua.goit;

import ua.goit.DatabaseStorage.DatabaseQueryService;
import ua.goit.dto.*;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException {

/*        List<LongestProjectDurationDTO> longestProjectDurations = DatabaseQueryService.findLongestProject();
        System.out.println("longestProjectDurations = " + longestProjectDurations);*/

/*        List<MaxProjectCountClientDTO> maxProjectCountClients = DatabaseQueryService.findMaxProjectsClient();
        System.out.println("maxProjectCountClients = " + maxProjectCountClients);*/

/*        List<MaxSalaryAmountWorkerDTO> maxSalaryAmountWorkers = DatabaseQueryService.findMaxSalaryAmountWorker();
        System.out.println("maxSalaryAmountWorkers = " + maxSalaryAmountWorkers);*/

/*        List<YoungestEldestWorkersDTO> youngestEldestWorkers = DatabaseQueryService.findYoungestEldestWorkers();
        System.out.println("youngestEldestWorkers = " + youngestEldestWorkers);*/

        List<PrintProjectPricesDTO> pintProjectPrices = DatabaseQueryService.printProjectPrices();
        System.out.println("pintProjectPrices = " + pintProjectPrices);

    }
}
