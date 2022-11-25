import logo from '../../assets/img/logo.svg'
import "./styles.css";

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>SC Infor</h1>
        <p>
          Desenvolvido por
          <a href="https://www.instagram.com/matheuscruzd20/"> @matheuscruzd20</a>
        </p>
      </div>
    </header>
  );
}

export default Header;
