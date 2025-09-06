public abstract class LogisticsService {
    String serviceName;

    LogisticsService(String serviceName) {
        this.serviceName = serviceName;
    }

    abstract String getServiceName();
}
