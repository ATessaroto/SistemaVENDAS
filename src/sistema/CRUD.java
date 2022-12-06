package sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.telaPrincipal;
import static usuarios.frmUsuarios.tabelaUser;
import static produtos.FrmProdutos.tabelaProdutos;
import usuarios.frmUsuarios;
import static vendas.frmCaixa.tabelaCaixa;
import static produtos.frmListaProd.txtCodProduto;
import static vendas.frmCaixa.txtTotal;

public class CRUD {

    public void registroUser(String user, String tipoUser, String senha) {

        frmUsuarios dados = new frmUsuarios();
        Connection conexao = null;
        PreparedStatement comando = null;

        frmUsuarios dadosUser = new frmUsuarios();

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "INSERT INTO usuarios(usuario,tipoUsuario,senha) VALUES(?,?,?)";

            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, user);
            comando.setString(2, tipoUser);
            comando.setString(3, senha);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Operação");
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void registroProd(String cod, String tipoProd, String prod, String valor) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "INSERT INTO produtos(cod,tipoProduto,nomeProduto,valor) VALUES(?,?,?,?)";

            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, cod);
            comando.setString(2, tipoProd);
            comando.setString(3, prod);
            comando.setString(4, valor);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Operação");
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarSenha(String senha, String user) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE usuarios SET senha=? WHERE usuario=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, senha);
            comando.setString(2, user);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarCOD(String attProd, String cod) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE produtos SET cod=? WHERE cod=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, attProd);
            comando.setString(2, cod);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarValor(String attProd, String cod) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE produtos SET valor=? WHERE cod=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, attProd);
            comando.setString(2, cod);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarUsuario(String attUser, String User) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE usuarios SET usuario=? WHERE usuario=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, attUser);
            comando.setString(2, User);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarProd(String attProd, String cod) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE produtos SET nomeProduto=? WHERE cod=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, attProd);
            comando.setString(2, cod);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarTipoUser(String tipoUser, String User) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE usuarios SET tipoUsuario=? WHERE usuario=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, tipoUser);
            comando.setString(2, User);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void editarTipoProd(String attProd, String cod) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "UPDATE produtos SET tipoProduto=? WHERE cod=?";
            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, attProd);
            comando.setString(2, cod);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro");
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void excluirUser(String user) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "DELETE FROM usuarios WHERE usuario=?";

            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, user);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Apagados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void excluirProduto(String codigo) {

        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = ClasseConexao.Conectar();
            String sql = "DELETE FROM produtos WHERE cod=?";

            comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, codigo);

            if (comando.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dados Apagados com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);
            try {
                comando.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public ResultSet confereLoginUser(UsuarioDTO U) {

        Connection conexao = null;
        PreparedStatement pstm = null;

        conexao = ClasseConexao.Conectar();

        UsuarioDTO objusuarioDTO = new UsuarioDTO();

        try {

            String sql = "SELECT * FROM usuarios where usuario=? and tipoUsuario=? and  senha=?";

            pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, U.getUser());
            pstm.setString(2, U.getTipoUser());
            pstm.setString(3, U.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;

        }

    }

    public ResultSet BuscaProduto(String produto) {

        Connection conexao = null;
        PreparedStatement pstm = null;

        conexao = ClasseConexao.Conectar();

        try {

            String sql = "SELECT * FROM produtos where produto=?";

            pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, produto);

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;

        }

    }

    public void CarregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaUser.getModel();
        modelo.setNumRows(0);

        tabelaUser.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaUser.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabelaUser.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabelaUser.getColumnModel().getColumn(3).setPreferredWidth(80);

        Connection conexao = null;

        try {
            Connection con = ClasseConexao.Conectar();
            PreparedStatement pstm;
            ResultSet rs;

            String sql = "SELECT * FROM usuarios";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)

                });

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);

        }
    }

    public void CarregaTabelaProd() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        modelo.setNumRows(0);

        tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(80);

        Connection conexao = null;

        try {
            Connection con = ClasseConexao.Conectar();
            PreparedStatement pstm;
            ResultSet rs;

            String sql = "SELECT * FROM produtos";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getFloat(4)

                });

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);

        }
    }

    public void CarregaTabelaProdEspecifico() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaCaixa.getModel();

        tabelaCaixa.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaCaixa.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabelaCaixa.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabelaCaixa.getColumnModel().getColumn(3).setPreferredWidth(100);
        
   

        Connection conexao = null;

        String codProduto = txtCodProduto.getText();

        try {
            Connection con = ClasseConexao.Conectar();
            PreparedStatement pstm;
            ResultSet rs;

            String sql = "SELECT * FROM produtos where cod=?";
            pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, codProduto);
            rs = pstm.executeQuery();

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getFloat(4)

                });
                
                
                
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ClasseConexao.FecharConexao(conexao);

        }
    }

}
