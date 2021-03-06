package gameClient;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class AgentJson {
    public class AgentJsonInner{
        public int id;
        public double value;
        public int src;
        public int dest;
        public int speed;
        @SerializedName("pos")
        public String locationStr;
    }


    public class AgentWrapperJson {
        @SerializedName("Agent")
        private AgentJsonInner agent;

        public AgentJsonInner getAgent() {
            return agent;
        }
    }

    @SerializedName("Agents")
    private List<AgentWrapperJson> agents;

    public List<AgentWrapperJson> getAgents() {
        return agents;
    }
}