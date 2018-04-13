package com.hnu.entity.results;

import java.util.List;

public class DirectorResult {
    private DirectorInfo directorInfo;

    private List<CaptaninInfo> captaninInfoList;

    private List<FactoryInfo> factoryInfoList;

    private AgentInfo agentInfo;

    public DirectorInfo getDirectorInfo() {
        return directorInfo;
    }

    public void setDirectorInfo(DirectorInfo directorInfo) {
        this.directorInfo = directorInfo;
    }

    public List<CaptaninInfo> getCaptaninInfoList() {
        return captaninInfoList;
    }

    public void setCaptaninInfoList(List<CaptaninInfo> captaninInfoList) {
        this.captaninInfoList = captaninInfoList;
    }

    public List<FactoryInfo> getFactoryInfoList() {
        return factoryInfoList;
    }

    public void setFactoryInfoList(List<FactoryInfo> factoryInfoList) {
        this.factoryInfoList = factoryInfoList;
    }

    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }
}