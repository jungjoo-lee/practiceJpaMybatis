import { combineReducers } from "redux";
import boardReducer from "./boardReducer";
import memberReducer from "./memberReducer";

const rootReducer = combineReducers({
    member: memberReducer,
    board: boardReducer
});
  
export default rootReducer;