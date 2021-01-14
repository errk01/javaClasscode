import React, { Component } from "react";
import { BrowserRouter, Route } from "react-router-dom";
import HomePage from "./components/HomePage";
import MenuPage from "./components/MenuPage";
import AboutPage from "./components/AboutPage";
import Page from "./components/Page";
import NavBarPage from "./NavBarPage";

class Routes extends Component {
  render() {
    return (
      <BrowserRouter>
        <NavBarPage />
        <div>
          <hr />
          <Route name="HomePage" exact path="/" component={HomePage} />
          <Route name="Menu" path="/menu" component={MenuPage} />
          <Route name="About" path="/about" component={AboutPage} />
          <Route name="page" path="/page" component={Page} />
        </div>
      </BrowserRouter>
    );
  }
}

export default Routes;
