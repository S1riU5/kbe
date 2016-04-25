package de.htw_berlin.ai_bachelor.kbe.checklist.listener;

import javax.faces.component.UIComponent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import java.util.HashMap;



public class MyPhaseListener implements PhaseListener {


    /**
     * Specifies the action before a phase
     *
     * @param phaseEvent
     */
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println(phaseEvent.getPhaseId().getName() + " Started");

    }

    /**
     * Specifies the action after a phase
     *
     * @param phaseEvent
     */
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println(phaseEvent.getPhaseId().getName() + " Ended inProgress ---");
        if (isRestoreViewPhase(phaseEvent)) {
            System.out.println("Postback: " + phaseEvent.getFacesContext().isPostback());
            System.out.println("Root ID: " + phaseEvent.getFacesContext().getViewRoot().getId());
            System.out.println("Components on Page: " + getComponentCount(phaseEvent.getFacesContext().getViewRoot()));
        }

        if (isRenderResponse(phaseEvent)) {
            HashMap<String, Integer> componentMap = new HashMap<String, Integer>();
            System.out.println("Root ID: " + phaseEvent.getFacesContext().getViewRoot().getId());
            System.out.println("Components on Page: " + getComponentCount(phaseEvent.getFacesContext().getViewRoot()));
            familyCount(phaseEvent.getFacesContext().getViewRoot(), componentMap);
            componentMap.forEach(
                    (key, val) -> System.out.println(key + ": " + val)
            );


        }

        System.out.println(phaseEvent.getPhaseId().getName() + " Ended ---");

    }

    /**
     * checks if the phase event is the Render response event
     *
     * @param phaseEvent
     * @return
     */
    private boolean isRenderResponse(PhaseEvent phaseEvent) {
        return phaseEvent.getPhaseId().equals(PhaseId.RENDER_RESPONSE);
    }

    /**
     * specifies the phase where the listener is active
     *
     * @return
     */
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    /**
     * Checks if a phase is the Restore view Phase
     *
     * @param phaseEvent
     * @return
     */
    private boolean isRestoreViewPhase(PhaseEvent phaseEvent) {
        return phaseEvent.getPhaseId().equals(PhaseId.RESTORE_VIEW);
    }

    /**
     * Counts all child UIComponents
     *
     * @param component
     * @return
     */
    private int getComponentCount(UIComponent component) {
        if (component == null) {
            return 0;
        }

        int count = 1;
        if (component.getChildren() != null) {
            for (UIComponent uiComponent : component.getChildren()) {
                count += getComponentCount(uiComponent);
            }
        }
        return count;
    }

    /**
     * counts the components per component Family
     *
     * @param component
     */
    private void familyCount(UIComponent component, HashMap<String, Integer> componentMap) {
        if (!componentMap.containsKey(component.getFamily())) {
            componentMap.put(component.getFamily(), 0);
        }

        componentMap.put(component.getFamily(), componentMap.get(component.getFamily()) + 1);

        if (component.getChildren() != null) {
            component.getChildren().forEach(child -> familyCount(child, componentMap));
        }
    }
}
