import { BrowserRouter ,Routes,Route} from 'react-router-dom';
import './App.css';
import Addemployee from './Components/Addemployee';
import Navbar from './Components/Navbar';
import EmployeeList from './Components/EmployeeList';

function App() {
  return (
    <div>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route index element={<EmployeeList />}></Route>
          <Route path="/" element={<EmployeeList />}></Route>
          <Route path="/employeeList" element={<EmployeeList />}></Route>
          <Route path="/addEmployee" element={<Addemployee />}></Route>
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
