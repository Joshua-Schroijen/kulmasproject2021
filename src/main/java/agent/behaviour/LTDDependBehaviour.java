/* Generated by Together */

package agent.behaviour;

import agent.AgentImp;

/**
 * abstract for dependency roles in the LTD synchronisation
 */
public abstract class LTDDependBehaviour extends DependBehaviour {
    /**
     * For the LTD scheme behaviours, this method does communication if in
     * communication phase
     * In action phase it triggers the actions of this behaviour.
     */
    public void handle(AgentImp agent) {
        super.handle(agent);
        if (hasHandled()) {
            return;
        }
        if (agent.inCommPhase()) {
            communicate(agent);
        } else if (agent.inActionPhase()) {
            act(agent);
        }
    }

    /**
     * This method handles the actions of the behaviour that are action
     * related
     */
    public abstract void act(AgentImp agent);

    /**
     * This method handles the actions of the behaviour that are communication
     * related. This does not include answering messages, only sending them.
     */
    public abstract void communicate(AgentImp agent);
}
