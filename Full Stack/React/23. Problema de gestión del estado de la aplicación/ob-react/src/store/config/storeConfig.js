import { createStore } from "redux";
import { composeWithDevTools } from 'redux-devtools-extension';
import { rootReducer } from "../reducers/rootReducer";

export const createAppStore = () => {
    let store = createStore(rootReducer, composeWithDevTools());

    return store;
}