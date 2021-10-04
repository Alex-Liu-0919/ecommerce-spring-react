import React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Test from "./components/Test";

const App = () => {
  return (
    <>
      <Router>
        <Switch>
          <Route path="/" exact component={Test} />
        </Switch>
      </Router>
    </>
  );
};

export default App;
