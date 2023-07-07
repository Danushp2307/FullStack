import LoginSignUp from "./LoginSignUp";
import Home from "./home_page";
import { BrowserRouter, Routes,Route } from 'react-router-dom';
import UserCRUDComponent from "./UserCRUDComponent";
import Navbar from "./navbar";
import AboutUs from "./about";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route element={<Navbar />} >
          <Route path="/" element={<Home />} />
          <Route path="/UserCRUDComponent" element={<UserCRUDComponent/>}/>
          <Route path="/AboutUs" element={<AboutUs/>}/>
          <Route path="/login" element={<LoginSignUp/>}/>
          </Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
