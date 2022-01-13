package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NameServer {
    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof DnsEntry)) return false;
            DnsEntry dnsEntry = (DnsEntry) o;
            return Objects.equals(hostName, dnsEntry.hostName) && Objects.equals(hostIp, dnsEntry.hostIp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hostName, hostIp);
        }
    }

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (getEntryByName(hostName) != null || getEntryByIp(hostIp) != null){
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        DnsEntry entry = getEntryByName(hostName);
        if (entry != null) {
            dnsEntries.remove(entry);
        }
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry entry = getEntryByIp(hostIp);
        if (entry != null) {
            dnsEntries.remove(entry);
        }
    }

    public String getIpByName(String hostName) {
        DnsEntry entry = getEntryByName(hostName);
        if (entry == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return entry.hostIp;
    }

    public String getNameByIp(String hostIp) {
        DnsEntry entry = getEntryByIp(hostIp);
        if (entry == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return entry.hostName;
    }

    private DnsEntry getEntryByName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(hostName)) {
                return actual;
            }
        }
        return null;
    }

    private DnsEntry getEntryByIp(String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostIp.equals(hostIp)) {
                return actual;
            }
        }
        return null;
    }
}
