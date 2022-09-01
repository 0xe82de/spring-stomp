import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Home from "./routes/Home";
import Chat from "./routes/Chat";

function App() {
  return (
      <Router>
        <Routes>
          <Route path="/" element={<Home/>}/>
        </Routes>
        <Routes>
          <Route path="/chat" element={<Chat/>}/>
        </Routes>
      </Router>
  );
}

export default App;
