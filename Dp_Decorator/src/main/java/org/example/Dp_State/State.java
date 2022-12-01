package org.example.Dp_State;

public abstract class State {
      protected AvoinImpl avoin;

      public State(AvoinImpl avoin) {
            this.avoin = avoin;
      }

      abstract void decoler();
      abstract void attirer();
      abstract void enterAuGarage();
      abstract void sortirDuGarage();
}
